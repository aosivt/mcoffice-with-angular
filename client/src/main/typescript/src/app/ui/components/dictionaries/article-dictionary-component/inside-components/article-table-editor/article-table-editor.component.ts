import { Component, OnInit, Inject, Input, InjectionToken } from '@angular/core';
import { TableEditorSidenavComponent } from 'src/app/ui/bases/components/table/inside-components/table-editor-sidenav/table-editor-sidenav.component';
import { ArticleDictionaryComponent } from '../../article-dictionary.component';
import { TableComponent } from 'src/app/ui/bases/components/table/table.component';
import { RowResultElement } from 'src/app/ui/bases/components/table/interfaces/row-result-elements';
import { FormGroup, FormControl, ReactiveFormsModule } from '@angular/forms';
import { ItemsWindowEditor } from 'src/app/ui/bases/components/table/interfaces/items-window-editor';
import { DisplayedColumnsElements } from 'src/app/ui/bases/components/table/interfaces/displayed-columns-elements';
import { TypeFieldEditor } from 'src/app/ui/bases/components/table/enums/type-field-editor';



@Component({
  selector: 'app-article-table-editor',
  templateUrl: './article-table-editor.component.html',
  styleUrls: ['./article-table-editor.component.css']
})
export class ArticleTableEditorComponent implements OnInit {
  items: ItemsWindowEditor = {};
  displayedViewColumns: DisplayedColumnsElements[];
  empty: RowResultElement;
  // articleForm: FormGroup;
  constructor(public table: TableComponent) {
    this.displayedViewColumns = this.table.getDisplayedViewCollumns();
    this._createForm();
  }

  ngOnInit() {
    console.log('asdfadsgfadfs');
  }
  private getLastSelected(): RowResultElement {
    const length = this.table.selection.selected.length - 1;
    return length >= 0 ? this.table.selection.selected[length] : this.createEmptyRowResultElement();
  }
  private createEmptyRowResultElement(): RowResultElement {
    if (this.empty == null) {
      this.empty = {id: ''};
      this.displayedViewColumns.forEach(f =>
        this.empty[f.key] = ''
    );
    }
    return this.empty;
  }
  fieldTempData(key, value) {
    this.items[key] = value;
    console.log(this.items);
    this.fieldData();
  }
  fieldData() {
    this.displayedViewColumns
        .filter(f => typeof this.items[f.key] !== 'undefined')
        .forEach(f => {
          this.getLastSelected()[f.key] = this.items[f.key];
          this.table.dataTableEditor[f.key] = this.items[f.key];
        });
  }
  private isTextField(field: TypeFieldEditor): boolean {
    return field === TypeFieldEditor.TEXT;
 }
 private isSelectEnumField(field: TypeFieldEditor): boolean {
  return field === TypeFieldEditor.SELECTENUM;
 }
 private isCheckBoxField(field: TypeFieldEditor): boolean {
  return field === TypeFieldEditor.CHECKBOX;
 }

 private clickSave() {
  this.empty = null;
  this.table.clickSaveButton(this.getLastSelected());
 }
 private clickCancel() {
  this.empty = null;
  this.table.editorElement.toggle();
 }
  private _createForm() {
  //   this.articleForm = new FormGroup({
  //       code: new FormControl(null),
  //       baseCode: new FormControl(null),
  //       allBaseCode: new FormControl(null),
  //       type: new FormControl(null),
  //       name: new FormControl(null),
  //       shortName: new FormControl(null),
  //       longName: new FormControl(null),
  //       paymentGroup: new FormControl(null),
  //       comment: new FormControl(null),
  //       typePack: new FormControl(null),
  //       classification: new FormControl(null),
  //       taxSystem: new FormControl(null),
  //       hasMinPrice: new FormControl(null),
  // });
  }

}
