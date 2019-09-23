
import { NgModule } from '@angular/core';
import { AppMaterialModule } from './material-module';
import { CommonModule } from '@angular/common';
import { RouterLink, Router, RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


import { WorkNode } from '../ui/components/header-back-office/header-back-office.component';

import { BanksDictionaryComponent } from '../ui/components/dictionaries/banks-dictionary-component/banks-dictionary.component';
import { ArticleDictionaryComponent } from '../ui/components/dictionaries/article-dictionary-component/article-dictionary.component';
import { Tag1214WayPaymentDictionaryComponent } from '../ui/components/dictionaries/tag1214-way-payment-dictionary-component/tag1214-way-payment-dictionary.component';
import { CountriesDictionaryComponent } from '../ui/components/dictionaries/countries-dictionary/countries-dictionary.component';
import { ScantechRegDictionaryComponent } from '../ui/components/dictionaries/scantech-reg-dictionary/scantech-reg-dictionary.component';

import { FilterTableComponent } from '../ui/bases/components/table/inside-components/filter-table/filter-table.component';
import { ContextMenuTableComponent } from '../ui/bases/components/table/inside-components/context-menu-table/context-menu-table.component';
import { PrintTableContentComponent } from '../ui/bases/components/table/inside-components/print-table-content/print-table-content.component';
import { TableEditorSidenavComponent } from '../ui/bases/components/table/inside-components/table-editor-sidenav/table-editor-sidenav.component';
import { ContentDialogErrorComponent } from '../ui/bases/components/table/inside-components/content-dialog-error/content-dialog-error.component';
import { ArticleTableEditorComponent } from '../ui/components/dictionaries/article-dictionary-component/inside-components/article-table-editor/article-table-editor.component';

@NgModule({
    declarations: [ BanksDictionaryComponent,
                    ArticleDictionaryComponent,
                    Tag1214WayPaymentDictionaryComponent,
                    FilterTableComponent,
                    ContextMenuTableComponent,
                    CountriesDictionaryComponent,
                    ScantechRegDictionaryComponent,
                    PrintTableContentComponent,
                    TableEditorSidenavComponent,
                    ArticleTableEditorComponent,
                    ContentDialogErrorComponent
                     ],
    imports: [ AppMaterialModule, CommonModule, FormsModule, ReactiveFormsModule ],
    exports: [ BanksDictionaryComponent, ArticleDictionaryComponent, Tag1214WayPaymentDictionaryComponent,
               FilterTableComponent, ContextMenuTableComponent , CountriesDictionaryComponent,
               ScantechRegDictionaryComponent, PrintTableContentComponent,
               TableEditorSidenavComponent, ArticleTableEditorComponent ],
    entryComponents: [ArticleTableEditorComponent, ContentDialogErrorComponent]
    }
    )

export class DictionaryModule {
    public static DICTIONARIES_PATH_TREE: WorkNode = {
        name: 'Справочники', action: 'table', icon: 'bookmarks', children: [
          ArticleDictionaryComponent.ARTICLE_DICTIONARIES_PATH_TREE,
          BanksDictionaryComponent.BANKS_DICTIONARIES_PATH_TREE,
          Tag1214WayPaymentDictionaryComponent.TAG1214_DICTIONARIES_PATH_TREE,
          CountriesDictionaryComponent.COUNTRIES_DICTIONARIES_PATH_TREE,
          ScantechRegDictionaryComponent.SCANTECH_REG_DICTIONARIES_PATH_TREE
        ]
    };
}
