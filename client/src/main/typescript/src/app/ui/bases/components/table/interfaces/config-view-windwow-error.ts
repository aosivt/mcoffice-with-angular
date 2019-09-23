import { DataWindowError } from './data-window-error';

export interface ConfigViewWindwowError {
    disableClose: boolean;
    width: string;
    height: string;
    position: {
      top: string;
      bottom: string;
      left: string;
      right: string;
    };
    data: DataWindowError;
  }
