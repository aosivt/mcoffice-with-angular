import { Component, ViewChild, OnInit, AfterViewInit, Directive } from '@angular/core';
import { ToolbarBackOfficeComponent } from '../toolbar-back-office/toolbar-back-office.component';
import { WebSocketService } from 'src/app/services/web-socket-service/web-socket-service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit, AfterViewInit {

  username: string;
  password: string;

  constructor(public toolBar: ToolbarBackOfficeComponent ) {
    this.clear();
    
  }

  ngOnInit() {}
  ngAfterViewInit() {}

  public login() {
    console.log(this.username);
    this.clear();
  }
  public clear() {
    this.username = '';
    this.password = '';
  }
  get title(): string {
    return this.toolBar.getLoginTitle();
  }

}
