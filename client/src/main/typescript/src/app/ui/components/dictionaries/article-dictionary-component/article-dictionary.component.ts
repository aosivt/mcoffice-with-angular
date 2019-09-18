import { Component, OnInit } from '@angular/core';
import { TableComponent } from 'src/app/ui/bases/components/table/table.component';
import { TypeFieldEditor } from 'src/app/ui/bases/components/table/enums/type-field-editor';
import { UnitDisableState } from 'src/app/ui/bases/types/enums/unit-disable-state';
import { ArticleType } from 'src/app/ui/bases/types/enums/artucle-type';
import { TaxSystemType } from 'src/app/ui/bases/types/enums/tax-system-type';
import { MeaSureUnitType } from 'src/app/ui/bases/types/enums/measure-unit-type';
import { WorkNode } from '../../header-back-office/header-back-office.component';
import { TabsEditorComponent } from 'src/app/ui/bases/components/table/inside-components/table-editor/interfaces/tabs-editor-component';



export class ArticleDictionaryComponent extends TableComponent {

  public static ARTICLE_DICTIONARIES_PATH_TREE: WorkNode = {
    name: 'Номенклатура', action: 'article' , icon: 'bookmark'
  };

  protected getRootPath(): string {
    return 'article';
  }

  public getDisplayedViewCollumns() {
    return [
      {key: 'id',             value: 'Индетификатор',         typeDB:   {},
                              typeView: TypeFieldEditor.TEXT,       view: false},
      {key: 'externalStrId',  value: 'Внешний идентификатор', typeDB:   {},
                              typeView: TypeFieldEditor.TEXT,       view: false},
      {key: 'name1',          value: 'Наименование 1',        typeDB:   {},
                              typeView: TypeFieldEditor.TEXT,       view: true},
      {key: 'name2',          value: 'Наименование 2', typeDB:   {},
                              typeView: TypeFieldEditor.TEXT,       view: true},
      {key: 'ecrshortname',   value: 'Короткое наименование', typeDB:   {},
                              typeView: TypeFieldEditor.TEXT,       view: true},
      {key: 'ecrlongname',    value: 'Длинное наименование', typeDB:   {},
                              typeView: TypeFieldEditor.TEXT,       view: true},
      {key: 'idMarket',       value: 'idMarket', typeDB:   {},
                              typeView: TypeFieldEditor.TEXT,       view: true},
      {key: 'idPricegroup',   value: 'idPricegroup', typeDB:   {},
                              typeView: TypeFieldEditor.TEXT,       view: true},
      {key: 'idParent',       value: 'idParent', typeDB:   {},
                              typeView: TypeFieldEditor.TEXT,       view: true},
      {key: 'note',           value: 'Расшифровка', typeDB:   {},
      typeView: TypeFieldEditor.TEXT,       view: true},
      {key: 'articletype',    value: 'Тип', typeDB:   ArticleType,
                              typeView: TypeFieldEditor.SELECTENUM, view: true},
      {key: 'flgDisable',     value: 'Состояние', typeDB:   UnitDisableState,
                              typeView: TypeFieldEditor.SELECTENUM, view: true},
      {key: 'unittype',       value: 'Тип еденици измерения', typeDB:   MeaSureUnitType,
                              typeView: TypeFieldEditor.SELECTENUM,       view: true},
      {key: 'idTaxSystem',    value: 'Налогообложения', typeDB:   TaxSystemType,
                              typeView: TypeFieldEditor.SELECTENUM, view: true},
      {key: 'hasMrc',         value: 'Имеет минимальную цену', typeDB:   {},
      typeView: TypeFieldEditor.CHECKBOX,       view: true},
    ];
  }

  protected getConfigTabForEditor(): TabsEditorComponent[] {
    return [
      { route: '',
        type:  'main',
        name:  'Главная'
      }
    ];
  }

  protected isVisibleButtonCopy():    boolean { return true; }
  protected isVisibleButtonInsert():  boolean { return true; }
  protected isVisibleButtonDelete():  boolean { return true; }
  protected isVisibleButtonUpdate():  boolean { return true; }
  protected isVisibleButtonPrint():   boolean { return true; }
  protected isVisibleButtonView():    boolean { return true; }
}


