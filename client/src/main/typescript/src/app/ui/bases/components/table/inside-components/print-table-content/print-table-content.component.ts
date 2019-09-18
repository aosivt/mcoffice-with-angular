import { Component, OnInit, Input } from '@angular/core';
import { TableComponent } from '../../table.component';
import { DisplayedColumnsElements } from '../../interfaces/displayed-columns-elements';

@Component({
  selector: 'app-print-table-content',
  templateUrl: './print-table-content.component.html',
  styleUrls: ['./print-table-content.component.css']
})
export class PrintTableContentComponent implements OnInit {
  
  @Input()
  public parentTable: TableComponent;

  
  constructor() { }

  ngOnInit() {
  }

  
  

}
