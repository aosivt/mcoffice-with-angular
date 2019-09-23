import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContentDialogErrorComponent } from './content-dialog-error.component';

describe('ContentDialogErrorComponent', () => {
  let component: ContentDialogErrorComponent;
  let fixture: ComponentFixture<ContentDialogErrorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContentDialogErrorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContentDialogErrorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
