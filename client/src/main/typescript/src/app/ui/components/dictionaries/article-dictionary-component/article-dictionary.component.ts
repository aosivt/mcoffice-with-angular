import { Component, OnInit, ViewChild, TemplateRef, EmbeddedViewRef, Injector, ReflectiveInjector } from '@angular/core';
import { TableComponent } from 'src/app/ui/bases/components/table/table.component';
import { TypeFieldEditor } from 'src/app/ui/bases/components/table/enums/type-field-editor';
import { UnitDisableState } from 'src/app/ui/bases/types/enums/unit-disable-state';
import { ArticleType } from 'src/app/ui/bases/types/enums/artucle-type';
import { TaxSystemType } from 'src/app/ui/bases/types/enums/tax-system-type';
import { MeaSureUnitType } from 'src/app/ui/bases/types/enums/measure-unit-type';
import { WorkNode } from '../../header-back-office/header-back-office.component';
import { TabsEditorComponent } from 'src/app/ui/bases/components/table/inside-components/table-editor/interfaces/tabs-editor-component';
import { ArticleTableEditorComponent } from './inside-components/article-table-editor/article-table-editor.component';
import { DisplayedColumnsElements } from 'src/app/ui/bases/components/table/interfaces/displayed-columns-elements';
import { JsonRpcResponse } from 'src/app/services/json-rpc/interfaces/json-rpc-response';



export class ArticleDictionaryComponent extends TableComponent {

  TableEditor = ArticleTableEditorComponent;
  instance: Injector;
  displayedCollumnsElements: DisplayedColumnsElements[];

  public static ARTICLE_DICTIONARIES_PATH_TREE: WorkNode = {
    name: 'Номенклатура', action: 'article' , icon: 'bookmark'
  };


  protected getRootPath(): string {
    return 'article';
  }

  public getDisplayedViewCollumns(): DisplayedColumnsElements[] {
    
    
    if (this._displayedColumns == null) {
      const that = this;
      
      this.service.callJsonRpcService(this.getRootPath(), 'getTableFieldsAnnotations')
      .subscribe((result: JsonRpcResponse[]) => {
        this._displayedColumns = result[0].result as DisplayedColumnsElements[];
        this.refresh();
        this.initInjector();
      }, error =>
        that.showDialogError(that.service.errorCallBack(error.error))
      );
    }
    return this._displayedColumns;
  }
  public initInjector() {
          this.instance =
          Injector.create({
          providers: [{provide: TableComponent,
          useValue: this.getInstance(),
          deps: []}],
          parent: this.injector});

    
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


