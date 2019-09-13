import { Component, OnInit, Input } from '@angular/core';
import { TableEditorComponent } from '../table-editor.component';
import { RowResultElement } from '../../../interfaces/row-result-elements';
import { ItemsWindowEditor } from '../../../interfaces/items-window-editor';
import { TypeFieldEditor } from '../../../enums/type-field-editor';

@Component({
  selector: 'app-main-editor',
  templateUrl: './main-editor.component.html',
  styleUrls: ['./main-editor.component.css']
})
export class MainEditorComponent implements OnInit {

  @Input()
  public parentEditor: TableEditorComponent;

  constructor() { }

  ngOnInit() {
  }
  fieldTempData(key, value) {
    this.parentEditor.items[key] = value;
  }
  fieldData() {
    this.parentEditor.data.viewRow
        .filter(f => typeof this.parentEditor.items[f.key] !== 'undefined')
        .forEach(f => this.parentEditor.data.dataRow[f.key] = this.parentEditor.items[f.key]);
  }
  clickCopyButton() {
    this.parentEditor.isCopy = true;
  }
  clickDeletedButton() {
    this.parentEditor.isDeleted = true;
    this.click();
  }
  click() {
    this.fieldData();
    this.callService();
    this.parentEditor.onNoClick();
  }
  callService() {
    if (this.parentEditor.isCopy) {
      this.callByPathService(this.parentEditor.data.insert);
      return;
     } else if (this.parentEditor.isDeleted) {
      this.callByPathService(this.parentEditor.data.delete);
      return;
     } else if ( typeof this.parentEditor.data.action !== 'undefined' && this.parentEditor.data.action !== null) {
      this.callByPathService(this.parentEditor.data.action);
      this.parentEditor.data.action = null;
      return;
     }
    this.callByPathService(this.parentEditor.data.update);
  }

  callByPathService(pathService: string) {
    this.parentEditor.data.service.getHttpConnect().post(
      this.parentEditor.data.service.
      getFullPathToWebServiceByPathService(pathService), this.parentEditor.data.dataRow).
      subscribe((result: RowResultElement) => {
        this.parentEditor.retult = result;
     });
  }
  private getValueFromDataRow(item: ItemsWindowEditor) {
    if (typeof this.parentEditor.data.dataRow === 'undefined') {
      this.parentEditor.data.dataRow = {id: ''};
      return '';
    } else if (typeof this.parentEditor.data.dataRow[item.key] === 'undefined') {
      return '';
    } else if (this.getTypeViewData(item.key) === TypeFieldEditor.SELECTENUM) {
      return this.getTextValueFromEnumType(item.key);
    }
    return this.parentEditor.data.dataRow[item.key];
  }
  private getTypeViewData(key: string): TypeFieldEditor {
   return this.parentEditor.data.viewRow.find(f => f.key === key).typeView;
  }
  private getTextValueFromEnumType(key: string) {
   const enumName: string = this.parentEditor.data.dataRow[key];
   return this.parentEditor.data.viewRow.find(f => f.key === key).typeDB['valueByName'](enumName).text;
  }
  private getValuesFromEnumType(key: {}) {
     return key['typeDB'].values();
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

}
