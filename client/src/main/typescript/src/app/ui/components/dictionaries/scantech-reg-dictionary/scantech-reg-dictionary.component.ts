import { Component, OnInit } from '@angular/core';
import { TypeFieldEditor } from 'src/app/ui/bases/components/table/enums/type-field-editor';
import { TableComponent } from 'src/app/ui/bases/components/table/table.component';
import { WorkNode } from '../../header-back-office/header-back-office.component';
import { DisplayedColumnsElements } from 'src/app/ui/bases/components/table/interfaces/displayed-columns-elements';

export class ScantechRegDictionaryComponent extends TableComponent {

  public static SCANTECH_REG_DICTIONARIES_PATH_TREE: WorkNode = {
    name: 'Регионы Скантек', action: 'scan-tech-reg', icon: 'bookmark'
  };

  protected getRootPath(): string {
    return 'scan-tech-reg';
  }

  // public getDisplayedViewCollumns(): DisplayedColumnsElements[] {
  //   return [
  //     {key: 'id',         value: 'Индетификатор',               typeDB:   {},
  //     defaultField: '',                    typeView: TypeFieldEditor.TEXT,       view: false},
  //     {key: 'name',       value: 'Наименование',                typeDB:   {},
  //     defaultField: '',                    typeView: TypeFieldEditor.TEXT,       view: true },
  //     {key: 'numCode',    value: 'Номенклатура кода',           typeDB:   {},
  //     defaultField: '',                    typeView: TypeFieldEditor.TEXT,       view: false },
  //     ];
  // }
  protected isVisibleButtonCopy():    boolean { return true; }
  protected isVisibleButtonInsert():  boolean { return true; }
  protected isVisibleButtonDelete():  boolean { return true; }
  protected isVisibleButtonUpdate():  boolean { return true; }
  protected isVisibleButtonPrint():   boolean { return true; }
  protected isVisibleButtonView():    boolean { return true; }
}
