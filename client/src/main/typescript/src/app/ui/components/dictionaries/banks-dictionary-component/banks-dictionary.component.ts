import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { TableComponent } from 'src/app/ui/bases/components/table/table.component';
import { TableModule } from 'src/app/main-modules/table.module';
import { AppMaterialModule } from 'src/app/main-modules/material-module';
import { DictionaryService } from 'src/app/services/dictionary-service';
import { MatDialog } from '@angular/material/dialog';
import { TypeFieldEditor } from 'src/app/ui/bases/components/table/enums/type-field-editor';
import { UnitDisableState } from 'src/app/ui/bases/types/enums/unit-disable-state';
import { WorkNode } from '../../header-back-office/header-back-office.component';
import { DisplayedColumnsElements } from 'src/app/ui/bases/components/table/interfaces/displayed-columns-elements';

export class BanksDictionaryComponent extends TableComponent {

  public static BANKS_DICTIONARIES_PATH_TREE: WorkNode = {
    name: 'Банки', action: 'bank', icon: 'bookmark'
  };

  protected getRootPath(): string {
    return 'bank';
  }

  protected isVisibleButtonCopy():    boolean { return true; }
  protected isVisibleButtonInsert():  boolean { return true; }
  protected isVisibleButtonDelete():  boolean { return true; }
  protected isVisibleButtonUpdate():  boolean { return true; }
  protected isVisibleButtonPrint():   boolean { return true; }
  protected isVisibleButtonView():    boolean { return true; }
}
