import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrintTableContentComponent } from './print-table-content.component';

describe('PrintTableContentComponent', () => {
  let component: PrintTableContentComponent;
  let fixture: ComponentFixture<PrintTableContentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrintTableContentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrintTableContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
