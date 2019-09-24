import { Component, Inject, Injectable} from '@angular/core';
import { Jsonp, URLSearchParams, Http, Response, Headers, RequestOptions } from '@angular/http';
import {DataSource} from '@angular/cdk/collections';

import {Observable} from 'rxjs';

import { map, filter, catchError, mergeMap } from 'rxjs/operators';

import {AbstractDictionaryService} from './abstract-dictionary-service';

import { BuilderJsonRpcRequest } from './json-rpc/builder-json-rpc-request';

import { RowResultElement } from '../ui/bases/components/table/interfaces/row-result-elements';

import { JsonRpcRequest } from './json-rpc/interfaces/json-rpc-request';
import { JsonRpcResponse } from './json-rpc/interfaces/json-rpc-response';
import { JsonRpcError } from './json-rpc/interfaces/json-rpc-error';
import { JsonRpcErrorType } from './json-rpc/json-rpc-error-type';
import { ConvertHelper } from '../utils/conver-helper';

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
  public getCollectionDictionaries(dictionary: string, dictionaryInterface: any) : Observable<any> {
    return this.getObserverResponseDictionary(dictionary).pipe(
        map((res: Response) => res.json())
    );
        // map((res:Response) => res.json());
  }

    /**
     * Метод для отправки значений в методы сервиса такие как [add,set,delete]
     * @param pathToMethodService путь к методу сервиса
     * @param requestParam объект URLSearchParams содержащий значение для метода к примеру (id, title, short_name and etc.)
     * @param body определение тела запроса
     * @return возращает добавленный/измененный/удаленные элемент БД 
     */
    public actionsForDirectories(pathToMethodService: string, requestParam: URLSearchParams, body: any ): Observable<any> {
        return this.getObserverResponseDictionaryWithAction(pathToMethodService, requestParam, body)
                .pipe(map((res: Response) => res.json()));
    }

    public createJsonRpcRequest(method: string, nameValue: string, value: any): JsonRpcRequest {
        return BuilderJsonRpcRequest.builder().setMethod(method).addParam(nameValue, value).build();
    }
    public createJsonRpcRequestByArrayObject(method: string, nameValue: string, value: any): JsonRpcRequest {
        return BuilderJsonRpcRequest.builder().setMethod(method).addParam(nameValue, value).build();
    }

    public callJsonRpcServiceForObject(path: string, method: string, data: RowResultElement[]) {
        console.log(data);
        const requets: JsonRpcRequest[] =
        data.map(
            r => BuilderJsonRpcRequest.builder().setMethod(method).addParam('model', r).build()
            );
        console.log(requets);
        this.getJsonRpcService(path, requets).pipe(map(result =>
            console.log(result)));
        return this.getJsonRpcService(path, requets);
    }

    protected createFieldParametrForService(nameParameter: string, parametr: {}): Map<string, {}> {
        return new Map([[nameParameter, parametr]]);
    }

    public callJsonRpcService(path: string, method: string, nameParam?: string, data?: any) {
        console.log(data);
        const builderRequest = BuilderJsonRpcRequest.builder();
        if (data != null) {
            builderRequest.addParam(nameParam, data);
        }
        const requets: JsonRpcRequest[] = [ builderRequest.setMethod(method).build() ];
        console.log(requets);
        // this.getJsonRpcService(path, requets).pipe(map(result =>
        //     console.log(result)));
        return this.getJsonRpcService(path, requets);
    }
    

    public errorCallBack(errors: JsonRpcError[]) {
        console.log(errors);
        // errors.forEach(f => console.log(JsonRpcErrorType.getErrorTypeByCode(f.error.code)));
        return errors;
    }
}
