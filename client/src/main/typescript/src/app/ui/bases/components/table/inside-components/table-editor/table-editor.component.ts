import { Component, Inject, OnDestroy, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { RowResultElement } from '../../interfaces/row-result-elements';
import { ItemsWindowEditor } from '../../interfaces/items-window-editor';
import { DataWindowEditor } from '../../interfaces/data-window-editor';
import { TypeFieldEditor } from '../../enums/type-field-editor';
import { TabsEditorComponent } from './interfaces/tabs-editor-component';
import { RouterLink, Router, ActivatedRoute } from '@angular/router';
import { FormControl } from '@angular/forms';
import { Subject } from 'rxjs';
import { takeUntil } from 'rxjs/operators';
@Component({
  selector: 'app-table-editor',
  templateUrl: './table-editor.component.html',
  styleUrls: ['./table-editor.component.css']
})
export class TableEditorComponent implements OnInit{
  isCopy: boolean = false;
  isDeleted: boolean = false;
  items: ItemsWindowEditor = {};
  retult: RowResultElement;
  selectedValue: string;

  destroy = new Subject<any>();
  currentDialog = null;
  
  selected = new FormControl(0);
  tabs: TabsEditorComponent[];
 constructor(
   public dialogRef: MatDialogRef<TableEditorComponent>,
   @Inject(MAT_DIALOG_DATA) public data: DataWindowEditor,
   route: ActivatedRoute,
   router: Router,
   ) {
    // router.navigate([{ outlets: { modal: '/mcoffice/article' }}]);
    

   }
  ngOnInit() {
    this.tabs = this.data.tabsConfig;
  }

 onNoClick(): void {
   this.dialogRef.close();
 }

getTabRouteByIndex(index: number) {
  if (this.tabs.length > 0) {
    return this.tabs[index].route;
  }
}
removeTab(route: string) {
  const index = this.tabs.indexOf(this.tabs.find(tab => tab.route === route));
  if (index > -1) {
    this.tabs.splice(index, 1);
  }
}

 get instance(): TableEditorComponent {
   return this;
 }
 
}

