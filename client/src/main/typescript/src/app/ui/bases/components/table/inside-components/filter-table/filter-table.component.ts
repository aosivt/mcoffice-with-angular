import { Component, OnInit, Input, NgModule, CUSTOM_ELEMENTS_SCHEMA, AfterViewInit, ViewChild } from '@angular/core';
import { DisplayedColumnsElements } from '../../interfaces/displayed-columns-elements';
import { TableComponent } from '../../table.component';
import { RowResultElement } from '../../interfaces/row-result-elements';
import { MatTableDataSource } from '@angular/material/table';
import { TypeFieldEditor } from '../../enums/type-field-editor';
import { MatSort } from '@angular/material/sort';
import { MatPaginator } from '@angular/material/paginator';

@Component({
  selector: 'app-filter-table',
  templateUrl: './filter-table.component.html',
  styleUrls: ['./filter-table.component.css']
})
export class FilterTableComponent implements OnInit, AfterViewInit {

  @Input()
  parentTable: TableComponent;
  @ViewChild(MatSort, {static: false}) sort: MatSort;
  @ViewChild(MatPaginator, {static: false}) paginator: MatPaginator;
  constructor() { }

  ngAfterViewInit() {
    this.sort.sortChange.subscribe(() => this.paginator.pageIndex = 0);
  }
  ngOnInit() {
    this.parentTable.refresh();
  }
  getViewHeader(item: string) {
    return this.parentTable._displayedColumns.find(df => df.key === item).value;
  }
  get displayedColumns(): string[] {
    return this.parentTable._displayedColumns.filter(f => f.view).map(d => d.key);
  }
  fieldFilterData(key: string, value: string) {
    this.parentTable.filterData[key] = value === '' ? null : value;
  }
  filterTable() {
    this.parentTable.filteredTableData();
  }
  private getConfigDisplayedColumn(key: string): DisplayedColumnsElements {
    return this.parentTable._displayedColumns.find(f => f.key === key);
  }
  private getTypeFieldEditor(key: string): TypeFieldEditor {
    return this.getConfigDisplayedColumn(key).typeView;
  }
  private isTextField(key: string): boolean {
    return this.getTypeFieldEditor(key) === TypeFieldEditor.TEXT;
  }
  private isSelectEnumField(key: string): boolean {
    return this.getTypeFieldEditor(key) === TypeFieldEditor.SELECTENUM;
  }
  private isCheckBoxField(key: string): boolean {
    return this.getTypeFieldEditor(key) === TypeFieldEditor.CHECKBOX;
  }
  private getEnumByKey(key: string) {
    const enumJ = this.getConfigDisplayedColumn(key).typeDB;
    return this.getValuesFromEnumType(enumJ);
   }
   private getValuesFromEnumType(key: {}) {
      return key['values']();
   }

}
