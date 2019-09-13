import {Component, OnInit, ViewChild} from '@angular/core';
import {FlatTreeControl} from '@angular/cdk/tree';
import {FormBuilder, FormGroup, FormControl} from '@angular/forms';
import {MatTreeFlatDataSource, MatTreeFlattener} from '@angular/material/tree';
import {HeaderTreeDataSource} from './header-back-office.data';
import { ToolbarBackOfficeComponent } from '../toolbar-back-office/toolbar-back-office.component';
import { RouterLink, Router, ActivatedRoute } from '@angular/router';
import { WebSocketService } from 'src/app/services/web-socket-service/web-socket-service';
import { MatDialog } from '@angular/material/dialog';



export interface WorkNode {
  name: string;
  action: any;
  icon: string;
  children?: WorkNode[];
}

interface WorkFlatNode {
  expandable: boolean;
  name: string;
  level: number;
}

export interface ItemTab {
  name: string;
  route: string;
}

/** @title Fixed sidenav */
@Component({
  selector: 'app-header-back-office',
  templateUrl: 'header-back-office.component.html',
  styleUrls: ['header-back-office.component.css'],
})
export class HeaderBackOfficeComponent implements OnInit {
  tabs: ItemTab[ ] = [ ];
  options: FormGroup;
  activeLinkIndex = -1;
  // @ViewChild(TableComponent, {static: false}) table: TableComponent;
  constructor(public toolBar: ToolbarBackOfficeComponent, fb: FormBuilder,
              public securityService: WebSocketService,
              private router: Router,
              private route: ActivatedRoute) {
    this.options = fb.group({
    bottom: 0,
    fixed: false,
    top: 0,

    });
    this.dataSource.data = HeaderTreeDataSource.HEADER_TREE_DATA_SOURCE;

    }

  private _transformer = (node: WorkNode, level: number) => {
    return {
      expandable: !!node.children && node.children.length > 0,
      name: node.name,
      level: level,
      action: node.action,
      icon: node.icon ? node.icon : 'folder_open'
    };
  }

  ngOnInit() {
    // this.route.queryParams.subscribe(params => console.log(params));
    // let sessionId = null;
    // console.log(document.cookie);
    // this.route.queryParamMap.forEach(_ => sessionId = _.get('sessions'));
    // if (sessionId === null) {

    // }
    // console.log(sessionId);
    // this.router.events.subscribe((res) => {
      // this.activeLinkIndex = this.tabs.indexOf(this.tabs.find(tab => tab.route === '.' + this.router.url));
  // });
  }
  treeControl = new FlatTreeControl<WorkFlatNode>(node => node.level, node => node.expandable);

  treeFlattener = new MatTreeFlattener(this._transformer, node => node.level, node => node.expandable,node => node.children);

  dataSource = new MatTreeFlatDataSource(this.treeControl, this.treeFlattener);

  hasChild = (_: number, node: WorkFlatNode) => node.expandable;

  selected = new FormControl(0);

  private getSession() {}


  addTab(title: string, url: string) {
    const index = this.tabs.indexOf(this.tabs.find(tab => tab.route === url));
    if (index < 0) {
      this.tabs.push({name: title, route: url});
      this.selected.setValue(this.tabs.length - 1);
    }
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
  get title(): string {
    return this.toolBar.getBackOfficeTitle();
  }
}
