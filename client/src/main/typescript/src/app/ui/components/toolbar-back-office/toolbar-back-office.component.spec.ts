import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ToolbarBackOfficeComponent } from './toolbar-back-office.component';

describe('ToolbarBackOfficeComponent', () => {
  let component: ToolbarBackOfficeComponent;
  let fixture: ComponentFixture<ToolbarBackOfficeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ToolbarBackOfficeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ToolbarBackOfficeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
