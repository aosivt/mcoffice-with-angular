import {
    Component, 
    Inject,
    Injectable} from '@angular/core';
import { 
    Jsonp, 
    URLSearchParams,
    Http, 
    Response,
    Headers, 
    RequestOptions } from '@angular/http';

import {DataSource} from '@angular/cdk/collections';
import {Observable} from 'rxjs';

import { map, filter, catchError, mergeMap } from 'rxjs/operators';

import {AbstractDictionaryService} from './abstract-dictionary-service';
import { JsonRpcRequest } from './interfaces/security/json-rpc-request';
import { JsonRpcResponce } from './interfaces/security/json-rpc-responce';
import { BuilderJsonRpcRequest } from './builder-json-rpc-request';
import { HttpHeaders } from '@angular/common/http';
import { RowResultElement } from '../ui/bases/components/table/interfaces/row-result-elements';

/**
 * Объект создан для получения списков справочников с сервиса БД
 */
@Injectable()
export class  DictionaryService extends AbstractDictionaryService {

    /**
     * Метод возращающий список справочника по стороковому наименованию его класса
     * @param dictionary - строковое наименование справочника на стороне сервиса
     * @returns возращает данные для отображения в таблице находящейся в диалоге {@link Observable<any>} 
     */
  getCollectionDictionaries(dictionary: string, dictionaryInterface: any) : Observable<any> {
    return this.getObserverResponseDictionary(dictionary).pipe(
        map((res:Response) => res.json())
        
        
    )
        // map((res:Response) => res.json());
  }

    /**
     * Метод для отправки значений в методы сервиса такие как [add,set,delete]
     * @param pathToMethodService путь к методу сервиса
     * @param requestParam объект URLSearchParams содержащий значение для метода к примеру (id, title, short_name and etc.)
     * @param body определение тела запроса
     * @return возращает добавленный/измененный/удаленные элемент БД 
     */
    actionsForDirectories(pathToMethodService: string, requestParam: URLSearchParams, body: any ): Observable<any> {
        return this.getObserverResponseDictionaryWithAction(pathToMethodService, requestParam, body)
                .pipe(map((res: Response) => res.json()));
    }

    public callJsonRpcService(path: string, method: string, data: RowResultElement[]) {
        console.log(data);
        const temp  = {
            model: data
        };
        const requets: JsonRpcRequest[] =
        data.map( r => BuilderJsonRpcRequest.builder().setMethod(method).setParam({
            model: r
        }).build());
        console.log(requets);
        return this.getJsonRpcService(path, requets);
    }



}
