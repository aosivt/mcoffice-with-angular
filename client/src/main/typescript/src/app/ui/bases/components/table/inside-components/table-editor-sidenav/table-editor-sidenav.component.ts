import { Component, OnInit, Input } from '@angular/core';
import { RouterLink, Router, ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-table-editor-sidenav',
  templateUrl: './table-editor-sidenav.component.html',
  styleUrls: ['./table-editor-sidenav.component.css']
})
export class TableEditorSidenavComponent implements OnInit {

  @Input()
  private parentTable;
  constructor() { }

  ngOnInit() {
  }

  public getInstance(): TableEditorSidenavComponent {
    return this;
  }
}
