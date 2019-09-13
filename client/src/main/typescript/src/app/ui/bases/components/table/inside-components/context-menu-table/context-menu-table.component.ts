import { Component, OnInit, ViewChild, Input } from '@angular/core';
import { MatMenuTrigger } from '@angular/material/menu';
import { DisplayedColumnsElements } from '../../interfaces/displayed-columns-elements';
import { TableComponent } from '../../table.component';

@Component({
  selector: 'app-context-menu-table',
  templateUrl: './context-menu-table.component.html',
  styleUrls: ['./context-menu-table.component.css']
})
export class ContextMenuTableComponent implements OnInit {

  @Input()
  parentTable: TableComponent;

  constructor() { }

  ngOnInit() {
  }

  @Input()
  _displayedColumns: DisplayedColumnsElements[];

  @ViewChild(MatMenuTrigger, {static: false})
  contextMenu: MatMenuTrigger;

  contextMenuPosition = { x: '0px', y: '0px' };

  onContextMenu(event: MouseEvent) {
    event.preventDefault();
    this.contextMenuPosition.x = event.clientX + 'px';
    this.contextMenuPosition.y = event.clientY + 'px';
    this.contextMenu.openMenu();
  }
  clearFilter() {
    this.parentTable.filterData = {};
    this.parentTable.refresh();
  }
  switchFilterField(item: string) {
    this.parentTable._displayedColumns.find(f => f.key === item).view =
        !this.parentTable._displayedColumns.find(f => f.key === item).view;
  }
  setCountElementInsideTable(index: number) {
    this.parentTable._indexCountElementInsideTable = index;
    this.parentTable.refresh();
  }

}

// export interface Item {
//   id: number;
//   name: string;
// }
// onContextMenu(event: MouseEvent, item: Item) {
  //   event.preventDefault();
  //   this.contextMenuPosition.x = event.clientX + 'px';
  //   this.contextMenuPosition.y = event.clientY + 'px';
  //   this.contextMenu.menuData = { 'item': item };
  //   this.contextMenu.openMenu();
  // }

  // onContextMenuAction1(item: Item) {
  //   alert(`Click on Action 1 for ${item.name}`);
  // }

  // onContextMenuAction2(item: Item) {
  //   alert(`Click on Action 2 for ${item.name}`);
  // }