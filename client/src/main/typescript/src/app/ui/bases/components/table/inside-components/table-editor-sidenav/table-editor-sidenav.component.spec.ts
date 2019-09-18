import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TableEditorSidenavComponent } from './table-editor-sidenav.component';

describe('TableEditorSidenavComponent', () => {
  let component: TableEditorSidenavComponent;
  let fixture: ComponentFixture<TableEditorSidenavComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TableEditorSidenavComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TableEditorSidenavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
