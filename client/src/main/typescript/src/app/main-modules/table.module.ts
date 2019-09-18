
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink, Router, RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/compiler/src/core';

import { AppMaterialModule } from './material-module';
import { DictionaryModule } from './dictionaries.module';

import { TableComponent } from '../ui/bases/components/table/table.component';
import { TableEditorComponent } from '../ui/bases/components/table/inside-components/table-editor/table-editor.component';
import { MainEditorComponent } from '../ui/bases/components/table/inside-components/table-editor/main-editor/main-editor.component';
import { FilterTableComponent } from '../ui/bases/components/table/inside-components/filter-table/filter-table.component';
import { ContextMenuTableComponent } from '../ui/bases/components/table/inside-components/context-menu-table/context-menu-table.component';






@NgModule({
  declarations: [ TableEditorComponent, MainEditorComponent ],
  entryComponents: [ TableEditorComponent ],
  providers: [],
  imports: [ AppMaterialModule, CommonModule, FormsModule, DictionaryModule, ReactiveFormsModule, RouterModule ],
  exports: [ FilterTableComponent, ContextMenuTableComponent ]
  })
export class TableModule { }
