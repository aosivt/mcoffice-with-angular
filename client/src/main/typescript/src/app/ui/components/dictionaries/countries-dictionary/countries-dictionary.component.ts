import { Component, OnInit } from '@angular/core';
import { TypeFieldEditor } from 'src/app/ui/bases/components/table/enums/type-field-editor';
import { TableComponent } from 'src/app/ui/bases/components/table/table.component';
import { WorkNode } from '../../header-back-office/header-back-office.component';

export class CountriesDictionaryComponent extends TableComponent {

  public static COUNTRIES_DICTIONARIES_PATH_TREE: WorkNode = {
    name: 'Страны', action: 'country', icon: 'bookmark'
  };

  protected getRootPath(): string {
    return 'country';
  }

  public getDisplayedViewCollumns() {
    return [
      {key: 'id',         value: 'Индетификатор',               typeDB:   {},
                          typeView: TypeFieldEditor.TEXT,       view: false},
      {key: 'name',       value: 'Наименование',                typeDB:   {},
                          typeView: TypeFieldEditor.TEXT,       view: true },
      {key: 'nameShort',  value: 'Короткое наименование',       typeDB:   {},
                          typeView: TypeFieldEditor.TEXT,       view: true },
      {key: 'countryEn13', value: 'Код страны в EAN нотации',                         typeDB:   {},
                          typeView: TypeFieldEditor.TEXT,       view: true },
      ];
  }
  protected isVisibleButtonCopy():    boolean { return true; }
  protected isVisibleButtonInsert():  boolean { return true; }
  protected isVisibleButtonDelete():  boolean { return true; }
  protected isVisibleButtonUpdate():  boolean { return true; }
  protected isVisibleButtonPrint():   boolean { return true; }
  protected isVisibleButtonView():    boolean { return true; }
}