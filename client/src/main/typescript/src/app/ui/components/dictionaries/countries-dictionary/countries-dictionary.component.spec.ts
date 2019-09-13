import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CountriesDictionaryComponent } from './countries-dictionary.component';

describe('CountriesDictionaryComponent', () => {
  let component: CountriesDictionaryComponent;
  let fixture: ComponentFixture<CountriesDictionaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CountriesDictionaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CountriesDictionaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
