import { Component, OnInit, Input } from '@angular/core';

const DEFAULT_TITLE = 'Загрузка данных...';
const LOGIN_TITLE = 'Регистрация пользователя:';
const BACK_OFFICE_TITLE = 'Управление торговлей';

@Component({
  selector: 'app-toolbar-back-office',
  templateUrl: './toolbar-back-office.component.html',
  styleUrls: ['./toolbar-back-office.component.css']
})
export class ToolbarBackOfficeComponent implements OnInit {
  public _title = DEFAULT_TITLE;
  public _showMenu = false;

  constructor() { }

  ngOnInit() {
  }
  @Input()
  set title(title: string) {
    this._title = title;
  }
  @Input()
  set showMenu(showMenu: boolean) {
    this._showMenu = showMenu;
  }
  get title(): string {
    return this._title;
  }
  get showMenu(): boolean {
    return this._showMenu;
  }
  
  public getLoginTitle(): string {
    return LOGIN_TITLE;
  }
  public getBackOfficeTitle(): string {
    return BACK_OFFICE_TITLE;
  }
}
