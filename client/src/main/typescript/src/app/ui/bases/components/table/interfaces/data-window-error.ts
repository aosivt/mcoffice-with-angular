import { RowResultElement } from './row-result-elements';
import { DisplayedColumnsElements } from './displayed-columns-elements';
import { DictionaryService } from 'src/app/services/dictionary-service';
import { TabsEditorComponent } from '../inside-components/table-editor/interfaces/tabs-editor-component';
import { JsonRpcError } from 'src/app/services/json-rpc/interfaces/json-rpc-error';

export interface DataWindowError {
    dataRow: JsonRpcError[];
}
