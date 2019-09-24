import { Component, OnInit, Input, ViewChild, AfterViewInit, Inject, ChangeDetectorRef, Injectable, Injector } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort, MatSortable } from '@angular/material/sort';
import { merge, Observable, of as observableOf } from 'rxjs';
import { catchError, map, startWith, switchMap } from 'rxjs/operators';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { MatDialogConfig } from '@angular/material/dialog/typings';
import { HttpParams } from '@angular/common/http';
import { SelectionModel } from '@angular/cdk/collections';
import { saveAs } from 'file-saver/src/FileSaver';


import { DictionaryService } from '../../../../services/dictionary-service';

import { TableEditorComponent } from './inside-components/table-editor/table-editor.component';
import { FilterTableComponent } from './inside-components/filter-table/filter-table.component';
import { PrintTableContentComponent } from './inside-components/print-table-content/print-table-content.component';

import { EnumType, EnumItemType, IStaticEnum, Enumerable } from 'src/app/ui/bases/types/enums/interfaces/ts-jenum';

import { TypeFieldEditor }          from './enums/type-field-editor';

import { RowResultElement }         from './interfaces/row-result-elements';
import { DisplayedColumnsElements } from './interfaces/displayed-columns-elements';
import { DataWindowEditor }         from './interfaces/data-window-editor';
import { ConfigViewWindwowEditor }  from './interfaces/config-view-windwow-editor';
import { ItemsWindowEditor }        from './interfaces/items-window-editor';
import { ContextMenuTableComponent } from './inside-components/context-menu-table/context-menu-table.component';
import { ActivatedRoute, Router } from '@angular/router';
import { TabsEditorComponent } from './inside-components/table-editor/interfaces/tabs-editor-component';
import { JsonRpcResponse } from 'src/app/services/json-rpc/interfaces/json-rpc-response';
import { TableEditorSidenavComponent } from './inside-components/table-editor-sidenav/table-editor-sidenav.component';
import { MatDrawer } from '@angular/material/sidenav';
import { ContentDialogErrorComponent } from './inside-components/content-dialog-error/content-dialog-error.component';
import { JsonRpcError } from 'src/app/services/json-rpc/interfaces/json-rpc-error';
import { ConfigViewWindwowError } from './interfaces/config-view-windwow-error';
import { DataWindowError } from './interfaces/data-window-error';



const EMPTY_TABLE_VALUE = '';
export const VIEW_EDIT_ROW = true;
@Injectable()
@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export abstract class TableComponent implements OnInit, AfterViewInit {
  
  selection = new SelectionModel<RowResultElement>(true, []);
  @ViewChild(MatPaginator, {static: false}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: false}) sort: MatSort;
  @ViewChild(ContextMenuTableComponent, {static: false}) contextMenu: ContextMenuTableComponent;
  @ViewChild(MatDrawer, {static: false}) editorElement: MatDrawer;

  _displayedColumns: DisplayedColumnsElements[] = this.getDisplayedViewCollumns();
  _customAction: string = null;

  _countElementInsideTable: number[] = [5, 10, 20, 30, 50, 100];
  _indexCountElementInsideTable: number = 3;
  config: MatDialogConfig = this.configViewWindwowEditor();
  configErrorWindow: MatDialogConfig = this.configViewWindwowEditor();
  _dataSource = new MatTableDataSource<RowResultElement>([]);

  filterData: ItemsWindowEditor = {};

  public dataTableEditor: RowResultElement = {id: ''};

  resultsLength = 0;
  isLoadingResults = true;
  isRateLimitReached = false;
  constructor(public service: DictionaryService,
              public dialog: MatDialog,
              private changeDetectorRefs: ChangeDetectorRef,
              public route: ActivatedRoute,
              public router: Router,
              public injector: Injector) { 
                this.getDisplayedViewCollumns();
              }

  ngOnInit() {}
  ngAfterViewInit() {
    this.refresh();
  }

  get countElementInsideTable() {
    return this._countElementInsideTable[this._indexCountElementInsideTable];
  }

  public refresh() {
    const that = this;
    this.service
        .callJsonRpcService(this.getRootPath(), this.getPathToServiceCollection())
        .pipe()
        .subscribe((result: JsonRpcResponse[]) => {
          // console.log(result);
          this._dataSource =
            new MatTableDataSource<RowResultElement>(result[0].result as RowResultElement[]);
          this.dataSource.paginator = this.paginator;
          this.sort.sortChange.subscribe(() => this.paginator.pageIndex = 0);
          this.dataSource.sort = this.sort;
          this.changeDetectorRefs.detectChanges();
        }, error => that.showDialogError(that.service.errorCallBack(error.error))
        );
  }
  @Input()
  set dataSource(data: MatTableDataSource<RowResultElement>) {
    this._dataSource = data;
  }
  @Input()
  setDataDisplayedColumns(data: DisplayedColumnsElements[]) {
    this._displayedColumns = data;
  }
  protected getDataDisplayedColumns(): DisplayedColumnsElements[] {
    return this._displayedColumns;
  }
  @Input()
  protected setCustomAction(action: string) {
    this._customAction = action;
  }
  public getCustomAction(): string {
    return this._customAction;
  }

  get dataSource(): MatTableDataSource<RowResultElement> {
    return this._dataSource;
  }

  get displayedColumns(): string[] {
    return this._displayedColumns.filter(f => f.view).map(d => d.key);
  }
  get displayedColumnsForFilter(): string[] {
    return this._displayedColumns.map(d => d.key);
  }
  isHideDisplayColumns(item: string): boolean {
    return this._displayedColumns.find(df => df.key === item).view;
  }
  get displayedColumnsWithSelect(): string[] {
    const temp = this.displayedColumns;
    temp.unshift('select');
    return temp;
  }
  protected abstract getRootPath(): string;
  public abstract getDisplayedViewCollumns(): DisplayedColumnsElements[];

  protected getPathToServiceCollection(): string {
    return 'getCollection';
  }
  protected getPathToServiceInsert(): string {
    return 'insertRecord';
  }
  protected getPathToServiceUpdate(): string {
    return 'updateRecord';
  }
  protected getPathToServiceDelete(): string {
    return 'deleteRecord';
  }
  protected getPathToServiceCollectionInsert(): string {
    return 'insertCollectionRecords';
  }
  protected getPathToServiceCollectionUpdate(): string {
    return 'updateCollectionRecords';
  }
  protected getPathToServiceCollectionDelete(): string {
    return 'deleteCollectionRecords';
  }
  protected getPathToServiceSelectCollectionByModel(): string {
    return 'getRecordByModel';
  }

  protected isVisibleButtonCopy(): boolean { return false; }
  protected isVisibleButtonInsert(): boolean { return false; }
  protected isVisibleButtonDelete(): boolean { return false; }
  protected isVisibleButtonUpdate(): boolean { return false; }
  protected isVisibleButtonPrint(): boolean { return false; }
  protected isVisibleButtonView(): boolean { return false; }

  getViewHeader(item: string) {
    return this._displayedColumns.find(df => df.key === item).value;
  }
  applyFilter(filterValue: string) {
    this._dataSource.filter = filterValue.trim().toLowerCase();
  }
  /** Whether the number of selected elements matches the total number of rows. */
  isAllSelected() {
    const numSelected = this.selection.selected.length;
    const numRows = this.dataSource.data.length;
    return numSelected === numRows;
  }
  /** Selects all rows if they are not all selected; otherwise clear selection. */
  masterToggle() {
    this.isAllSelected() ?
        this.selection.clear() :
        this.dataSource.data.forEach(row => this.selection.select(row));
  }
  /** The label for the checkbox on the passed row */
  checkboxLabel(row?: RowResultElement): string {
    if (!row) {
      return `${this.isAllSelected() ? 'select' : 'deselect'} all`;
    }
    return `${this.selection.isSelected(row) ? 'deselect' : 'select'} row ${row.id}`;
  }

  public clickDeletedButton() {
    const that = this;
    this.service.callJsonRpcService(this.getRootPath(),
                                    this.getPathToServiceCollectionDelete(),
                                    'models',
                                    this.selection.selected)
      .subscribe((result: JsonRpcResponse) => {
        // // console.log(result);
        this.refresh();
      }, error =>
      that.showDialogError(that.service.errorCallBack(error.error))
      );
    this.selection.clear();
  }

  public clickInsertButton() {
    this.editorElement.toggle();
    this.selection.clear();
    // const emptyRow = {id: ''};
    // this._customAction = this.getPathToServiceInsert();
    // this.showEditor(emptyRow);
  }

  public clickSaveButton(dataTableEditor?: RowResultElement) {
    this.editorElement.toggle();

    const that = this;
    this.service.callJsonRpcService(this.getRootPath(),
                                    this.getPathToServiceCollectionInsert(),
                                    'models',
                                    [dataTableEditor])
      .subscribe((result: JsonRpcResponse) => {
        // // console.log(result);
        this.refresh();
      }, error =>
        that.showDialogError(that.service.errorCallBack(error.error))
      );
    this.selection.clear();
  }
  public clickEditButton() {
    this.editorElement.toggle();
    // this.selection.clear();
    // this.router.navigate([{ outlets: { primary: 'edit' }}]);
    // const row = this.selection.selected[0];
    // this._customAction = this.getPathToServiceUpdate();
    // this.showEditor(row);
    // this.selection.clear();

  }
  public clickCopyButton() {
    const row = this.selection.selected[0];
    this._customAction = this.getPathToServiceInsert();
    this.showEditor(row);
    this.selection.clear();
  }
  public clickViewButton() {
    // const row = this.selection.selected[0];
    this.editorElement.toggle();
    // this._customAction = this.getPathToServiceInsert();
    // this.config.data.isOnlyView = true;
    // this.showEditor(row);
    // this.selection.clear();
  }
  public isMoreOneSelectedRow() {
    return this.selection.selected.length !== 1;
  }
  
  public showEditor(value: RowResultElement) {
    this.config.data.dataRow = value;
    this.config.data.action = this.getCustomAction();
    const dialogRef = this.dialog.open( TableEditorComponent, this.config);
    dialogRef.afterClosed().subscribe(result => {
      // // console.log(result);
      this._customAction = null;
      this.config.data.isOnlyView = false;
      this.filteredTableData();
    });
  }
  public showDialogError(errors: JsonRpcError[]) {
    // // console.log(errors);
    this.config.data.dataRow = errors;
    const dialogRef = this.dialog.open( ContentDialogErrorComponent, this.config);
    dialogRef.afterClosed().subscribe(result => {
      // // console.log(result);
      // this._customAction = null;
      // this.config.data.isOnlyView = false;
      // this.filteredTableData();
    });
  }

    public getValueFromElement(key: {}, item: string ) {
    if (key[item] === null) {
      return EMPTY_TABLE_VALUE;
    } else if (this._displayedColumns.find(f => f.key === item).typeView === TypeFieldEditor.SELECTENUM) {
      return this._displayedColumns.find(f => f.key === item).typeDB['valueByName'](key[item]).text;
    } else if (this._displayedColumns.find(f => f.key === item).typeView === TypeFieldEditor.SELECTDB) {
      return key[item][this._displayedColumns.find(f => f.key === item).defaultField];
    } else if (this._displayedColumns.find(f => f.key === item).typeView === TypeFieldEditor.CHECKBOX) {
      return key[item] ? 'Да' : 'Нет';
    }
    return key[item];
  }

  public clickPrintButton() {
    // // console.log(this.dataSource._orderData(this.dataSource.filteredData));
    let printContents;
    let popupWin;
    printContents = document.getElementById('print-section').innerHTML;
    popupWin = window.open('', '_blank', 'top=0,left=0,height=100%,width=auto');
    popupWin.document.open();
    popupWin.document.write(`
      <html>
        <head>
          <title>Print tab</title>
          <style>
          //........Customized style.......
          </style>
        </head>
    <body onload="window.print();window.close()">${printContents}</body>
      </html>`
    );
    // popupWin.document.close();
  }

  protected configViewWindwowEditor(): ConfigViewWindwowEditor {
    return {
      disableClose: false,
      width: '800',
      height: '',
      position: {
        top: '',
        bottom: '',
        left: '',
        right: ''
      },
      data: this.dataViewWindowEditor()
    };
  }
  protected configViewWindwowError(): ConfigViewWindwowError {
    return {
      disableClose: false,
      width: '800',
      height: '800',
      position: {
        top: '',
        bottom: '',
        left: '',
        right: ''
      },
      data: this.dataViewWindowError()
    };
  }

  protected dataViewWindowEditor(): DataWindowEditor {
    return {
      dataRow: null,
      viewRow: this.getDataDisplayedColumns(),
      service: this.service,
      insert: this.getPathToServiceInsert(),
      update: this.getPathToServiceUpdate(),
      delete: this.getPathToServiceDelete(),
      action: null,
      isOnlyView: false,
      tabsConfig: this.getConfigTabForEditor()
    };
  }
  protected dataViewWindowError(): DataWindowError {
    return { dataRow: null };
  }
  protected getConfigTabForEditor(): TabsEditorComponent[] {
    return [
      { route: '',
        type:  'main',
        name:  'Главная'
      }
    ];
  }

  public filteredTableData() {
    const countFildingField = this.displayedColumns.
                                    filter((f) => typeof this.filterData[f] !== 'undefined').
                                    filter( f => this.filterData[f] !== '').length;
    if (countFildingField === 0) {
      this.refresh();
      return;
    }

    const that = this;
    this.service.callJsonRpcService(this.getRootPath(),
                                    this.getPathToServiceSelectCollectionByModel(),
                                    'model',
                                    this.filterData)
                                    .subscribe((result: JsonRpcResponse[]) => {
                                      // // console.log(result);
                                      this._dataSource = new MatTableDataSource<RowResultElement>(result[0].result as RowResultElement[]);
                                      this.dataSource.paginator = this.paginator;
                                      this.dataSource.sort = this.sort;
                                      this.changeDetectorRefs.detectChanges();
                                      // this.refresh();
                                    }, error =>
                                      that.showDialogError(that.service.errorCallBack(error.error))
                                    );
    // this.service.getHttpConnect().post(
    // this.service.
    // getFullPathToWebServiceByPathService(
    // this.getPathToServiceSelectCollectionByModel()), this.filterData).
    // subscribe((result: RowResultElement[]) => {
    // this._dataSource = new MatTableDataSource<RowResultElement>(result);
    // this.dataSource.paginator = this.paginator;
    // this.dataSource.sort = this.sort;
    // this.changeDetectorRefs.detectChanges();
    // });
    this.selection.clear();
  }
  public isTextField(key: string): boolean {
    const t = this.getTypeFieldEditor(key);
    // console.log('------------------------------------------------------');
    // console.log();
    return TypeFieldEditor[TypeFieldEditor[t]].toString() === TypeFieldEditor[TypeFieldEditor.TEXT].toString();
  }
  private isSelectEnumField(key: string): boolean {
    return this.getTypeFieldEditor(key) === TypeFieldEditor.SELECTENUM;
  }
  private isCheckBoxField(key: string): boolean {
    return this.getTypeFieldEditor(key) === TypeFieldEditor.CHECKBOX;
  }
  private isSelectDBField(key: string){
    return this.getTypeFieldEditor(key) === TypeFieldEditor.SELECTDB;
  }
  private getTypeFieldEditor(key: string): TypeFieldEditor {
    return this.getConfigDisplayedColumn(key).typeView;
  }
  private getConfigDisplayedColumn(key: string): DisplayedColumnsElements {
    return this._displayedColumns.find(f => f.key === key);
  }
  private getEnumByKey(key: string) {
    const enumJ = this.getConfigDisplayedColumn(key).typeDB;
    return this.getValuesFromEnumType(enumJ);
  }
  private getValuesFromEnumType(key: {}) {
    return key['values']();
  }
  protected fieldFilterData(key: string, value: string) {
    this.filterData[key] = value === '' ? null : value;
  }

  private downloadFile() {
    const replacer = (key, value) => value === null ? '' : value; // specify how you want to handle null values here
    const header = this.displayedColumns.map(h => this.getViewHeader(h));

    // Object.keys(data[0]);
    const csv =
      this.dataSource
        ._orderData(this.dataSource.filteredData)
        .map(item => this.displayedColumns
        .map(key => JSON.stringify(this.getValueFromElement(item, key), replacer))
        .join(','));

    // data.map(row => header.map(fieldName => JSON.stringify(row[fieldName], replacer)).join(','));
    csv.unshift(header.join(','));
    const csvArray = csv.join('\r\n');

    const blob = new Blob([csvArray], {type: 'text/csv' });
    saveAs(blob, 'test.csv');
  }


  
  public getInstance(): TableComponent {
    return this;
  }
}
