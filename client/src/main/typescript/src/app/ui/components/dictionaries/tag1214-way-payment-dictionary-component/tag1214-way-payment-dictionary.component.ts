import { Component, OnInit } from '@angular/core';
import { TableComponent } from 'src/app/ui/bases/components/table/table.component';
import { TypeFieldEditor } from 'src/app/ui/bases/components/table/enums/type-field-editor';
import { WorkNode } from '../../header-back-office/header-back-office.component';
import { DisplayedColumnsElements } from 'src/app/ui/bases/components/table/interfaces/displayed-columns-elements';

export class Tag1214WayPaymentDictionaryComponent extends TableComponent {

  public static TAG1214_DICTIONARIES_PATH_TREE: WorkNode = {
    name: 'Возможные значения тега 1214', action: 'tag-1214-way-payment' , icon: 'bookmark'
  };
  
  protected getRootPath(): string {
    return 'tag-1214-way-payment';
  }

  // public getDisplayedViewCollumns(): DisplayedColumnsElements[] {
  //   return [
  //     {key: 'id',         value: 'Индетификатор',               typeDB:   {},
  //     defaultField: '',                    typeView: TypeFieldEditor.TEXT,       view: false},
  //     {key: 'name',       value: 'Наименование',                typeDB:   {},
  //     defaultField: '',                    typeView: TypeFieldEditor.TEXT,       view: true },
  //     ];
  // }

  protected isVisibleButtonView(): boolean { return true; }

}
