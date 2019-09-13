import { Injectable } from '@angular/core';
import { WorkNode } from './header-back-office.component';
import { DictionaryModule } from 'src/app/main-modules/dictionaries.module';


export const AUTO_ORDERS_PATH_TREE: WorkNode = {
  name: 'Автозаказы', action: 'table',  icon: ''
};
export const DISCOUNTS_PATH_TREE: WorkNode = {
  name: 'Скидки', action: 'table' , icon: '',
};
export const CAFE_PATH_TREE: WorkNode = {
  name: 'Кафе', action: 'table' , icon: '',
};
export const CURRENT_BALANCES_IN_THE_TANKS_PATH_TREE: WorkNode = {
  name: 'Текущие остатки в резервуарах', action: 'table' , icon: '',
};
export const DOCUMENTS_PATH_TREE: WorkNode = {
  name: 'Документы', action: 'table' , icon: '',
};
export const TTN_GSM_PATH_TREE: WorkNode = {
  name: 'ТТН ГСМ', action: 'table' , icon: '',
};
export const PRINT_SETTINGS_PATH_TREE: WorkNode = {
  name: 'Настройки печати', action: 'table' , icon: '',
};
export const SHIFT_CHANCGE_SCHEDULE_GAS_STATION_PATH_TREE: WorkNode = {
  name: 'Расписание пересменков АЗС', action: 'table' , icon: '',
};

export const ROOT_PATH_TREE: WorkNode = {
  name: 'Задачи', action: 'table', icon: '', children: [
    AUTO_ORDERS_PATH_TREE, DictionaryModule.DICTIONARIES_PATH_TREE, DISCOUNTS_PATH_TREE,
    CAFE_PATH_TREE, CURRENT_BALANCES_IN_THE_TANKS_PATH_TREE,
    DOCUMENTS_PATH_TREE, TTN_GSM_PATH_TREE, PRINT_SETTINGS_PATH_TREE,
    SHIFT_CHANCGE_SCHEDULE_GAS_STATION_PATH_TREE
  ]
};

@Injectable()
export class HeaderTreeDataSource {
  public static HEADER_TREE_DATA_SOURCE = [ ROOT_PATH_TREE ];
}
