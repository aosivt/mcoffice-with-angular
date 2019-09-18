import { Component, OnInit } from '@angular/core';
import { TableComponent } from 'src/app/ui/bases/components/table/table.component';
import { TypeFieldEditor } from 'src/app/ui/bases/components/table/enums/type-field-editor';
import { WorkNode } from '../../header-back-office/header-back-office.component';

export class Tag1214WayPaymentDictionaryComponent extends TableComponent {

  public static TAG1214_DICTIONARIES_PATH_TREE: WorkNode = {
    name: 'Справочник возможных значение тега 1214', action: 'tag1214_way_payment' , icon: 'bookmark'
  };
  
  protected getRootPath(): string {
    return 'tag1214_way_payment';
  }

  public getDisplayedViewCollumns() {
    return [
      {key: 'id',         value: 'Индетификатор',               typeDB:   {},
                          typeView: TypeFieldEditor.TEXT,       view: false},
      {key: 'name',       value: 'Наименование',                typeDB:   {},
                          typeView: TypeFieldEditor.TEXT,       view: true },
      ];
  }

  protected isVisibleButtonView(): boolean { return true; }

}
