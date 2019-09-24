import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './ui/components/login-back-office/login.component';
import { HeaderBackOfficeComponent } from './ui/components/header-back-office/header-back-office.component';
import { McoEmptyPageComponent } from './ui/components/mco-empty-page/mco-empty-page.component';

import { BanksDictionaryComponent } from './ui/components/dictionaries/banks-dictionary-component/banks-dictionary.component';
import { ArticleDictionaryComponent } from './ui/components/dictionaries/article-dictionary-component/article-dictionary.component';
import { CountriesDictionaryComponent } from './ui/components/dictionaries/countries-dictionary/countries-dictionary.component';
import { Tag1214WayPaymentDictionaryComponent } from './ui/components/dictionaries/tag1214-way-payment-dictionary-component/tag1214-way-payment-dictionary.component';
import { ScantechRegDictionaryComponent } from './ui/components/dictionaries/scantech-reg-dictionary/scantech-reg-dictionary.component';
import { TableEditorComponent } from './ui/bases/components/table/inside-components/table-editor/table-editor.component';
import { MainEditorComponent } from './ui/bases/components/table/inside-components/table-editor/main-editor/main-editor.component';
import { ArticleTableEditorComponent } from './ui/components/dictionaries/article-dictionary-component/inside-components/article-table-editor/article-table-editor.component';
import { FuelEcologicalClassDictionaryComponent } from './ui/components/dictionaries/fuel-ecological-class-dictionary/fuel-ecological-class-dictionary.component';


// определение маршрутов

export const appRoutes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
  public static routers: Routes = [
    { path: 'login', component: LoginComponent},
    { path: '', redirectTo: 'mcoffice', pathMatch: 'full'},
    // { path: '**', redirectTo: 'mcoffice', pathMatch: 'full'},
    { path: 'mcoffice', component: HeaderBackOfficeComponent, children: [
        // { outlet: 'sidebarContent', path: '', component: BanksDictionaryComponent },
        { outlet: 'sidebarContent', path: '', component: McoEmptyPageComponent },
        { outlet: 'primary', path: '', component: McoEmptyPageComponent, },
        { outlet: 'primary', path: 'bank', component: BanksDictionaryComponent, },
        { outlet: 'primary', path: 'article', component: ArticleDictionaryComponent, children: [
          {outlet: 'primary', path: 'editor', component: ArticleTableEditorComponent}
        ] },
        { outlet: 'primary', path: 'country', component: CountriesDictionaryComponent },
        { outlet: 'primary', path: 'tag-1214-way-payment', component: Tag1214WayPaymentDictionaryComponent },
        { outlet: 'primary', path: 'scan-tech-reg', component: ScantechRegDictionaryComponent },
        { outlet: 'primary', path: 'fuel-ecological-class', component: FuelEcologicalClassDictionaryComponent },
        { outlet: 'modal', path: 'article', component: McoEmptyPageComponent },
        ] },
  ];

}
