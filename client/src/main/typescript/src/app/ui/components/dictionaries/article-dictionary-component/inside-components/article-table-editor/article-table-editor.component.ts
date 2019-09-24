import { Component, OnInit, Inject, Input, InjectionToken, AfterViewInit, OnChanges } from '@angular/core';
import { TableEditorSidenavComponent } from 'src/app/ui/bases/components/table/inside-components/table-editor-sidenav/table-editor-sidenav.component';
import { ArticleDictionaryComponent } from '../../article-dictionary.component';
import { TableComponent } from 'src/app/ui/bases/components/table/table.component';
import { RowResultElement } from 'src/app/ui/bases/components/table/interfaces/row-result-elements';
import { FormGroup, FormControl, ReactiveFormsModule } from '@angular/forms';
import { ItemsWindowEditor } from 'src/app/ui/bases/components/table/interfaces/items-window-editor';
import { DisplayedColumnsElements } from 'src/app/ui/bases/components/table/interfaces/displayed-columns-elements';
import { TypeFieldEditor } from 'src/app/ui/bases/components/table/enums/type-field-editor';



@Component({
  selector: 'app-article-table-editor',
  templateUrl: './article-table-editor.component.html',
  styleUrls: ['./article-table-editor.component.css']
})
export class ArticleTableEditorComponent implements OnInit, AfterViewInit {
  items: ItemsWindowEditor = {};
  displayedViewColumns: DisplayedColumnsElements[];
  empty: RowResultElement;

  constructor(public table: TableComponent) {
    
  }

  ngOnInit() {

  }

  ngAfterViewInit() {
      this.displayedViewColumns = this.table.getDisplayedViewCollumns();
  }

  private getLastSelected(): RowResultElement {
    // console.log('----------------------------------------------------');
    const length = this.table.selection.selected.length - 1;
    // console.log(length);
    return length >= 0 ? this.table.selection.selected[length] : this.createEmptyRowResultElement();
  }
  public createEmptyRowResultElement(): RowResultElement {
    if (this.empty == null) {
      this.empty = {id: ''};

      this.table.getDisplayedViewCollumns().forEach(f =>
        this.empty[f.key] = ''
    );
    }
    return this.empty;
  }

  fieldTempData(key, value) {
    this.items[key] = value;
    console.log(this.items);
    this.fieldData();
  }

  fieldData() {
    this.displayedViewColumns
        .filter(f => typeof this.items[f.key] !== 'undefined')
        .forEach(f => {
          this.getLastSelected()[f.key] = this.items[f.key];
          this.table.dataTableEditor[f.key] = this.items[f.key];
        });
  }

  private isTextField(field): boolean {
    return this.table.isTextField(field);
  }
  private isSelectEnumField(field): boolean {
    return field === TypeFieldEditor.SELECTENUM;
  }
  private isCheckBoxField(field): boolean {
    return field === TypeFieldEditor.CHECKBOX;
  }

  private clickSave() {
    this.empty = null;
    this.table.clickSaveButton(this.getLastSelected());
  }
  private clickCancel() {
    this.empty = null;
    this.table.editorElement.toggle();
  }
  private getInstance(): ArticleTableEditorComponent {
    return this;
  }
}
