import { TypeFieldEditor } from '../enums/type-field-editor';

export interface DisplayedColumnsElements {
    key: string;
    value: string;
    typeDB: {};
    typeView: TypeFieldEditor;
    view: boolean;
    defaultField: string;
}
