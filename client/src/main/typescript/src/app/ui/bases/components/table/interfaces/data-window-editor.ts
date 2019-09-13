import { RowResultElement } from './row-result-elements';
import { DisplayedColumnsElements } from './displayed-columns-elements';
import { DictionaryService } from 'src/app/services/dictionary-service';
import { TabsEditorComponent } from '../inside-components/table-editor/interfaces/tabs-editor-component';

export interface DataWindowEditor {
    dataRow: RowResultElement;
    viewRow: DisplayedColumnsElements[];
    service: DictionaryService;
    insert: string;
    update: string;
    delete: string;
    action: string;
    isOnlyView: boolean;
    tabsConfig: TabsEditorComponent[];
    }
