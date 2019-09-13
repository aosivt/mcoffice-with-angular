import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ArticleDictionaryComponent } from './article-dictionary.component';

describe('ArticleDictionaryComponent', () => {
  let component: ArticleDictionaryComponent;
  let fixture: ComponentFixture<ArticleDictionaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ArticleDictionaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ArticleDictionaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
