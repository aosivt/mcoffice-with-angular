import { DataWindowEditor } from './data-window-editor';

export interface ConfigViewWindwowEditor {
    disableClose: boolean;
    width: string;
    height: string;
    position: {
      top: string;
      bottom: string;
      left: string;
      right: string;
    };
    data: DataWindowEditor;
  }
