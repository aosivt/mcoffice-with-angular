import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContextMenuTableComponent } from './context-menu-table.component';

describe('ContextMenuTableComponent', () => {
  let component: ContextMenuTableComponent;
  let fixture: ComponentFixture<ContextMenuTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContextMenuTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContextMenuTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
