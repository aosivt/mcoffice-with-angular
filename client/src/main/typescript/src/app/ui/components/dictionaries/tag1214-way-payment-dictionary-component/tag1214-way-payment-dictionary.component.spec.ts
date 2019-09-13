import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Tag1214WayPaymentDictionaryComponent } from './tag1214-way-payment-dictionary.component';

describe('Tag1214WayPaymentDictionaryComponentComponent', () => {
  let component: Tag1214WayPaymentDictionaryComponent;
  let fixture: ComponentFixture<Tag1214WayPaymentDictionaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Tag1214WayPaymentDictionaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Tag1214WayPaymentDictionaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
