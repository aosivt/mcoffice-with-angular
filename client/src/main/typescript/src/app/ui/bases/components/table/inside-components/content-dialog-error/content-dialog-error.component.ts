import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { DataWindowEditor } from '../../interfaces/data-window-editor';
import { DataWindowError } from '../../interfaces/data-window-error';
import { JsonRpcError } from 'src/app/services/json-rpc/interfaces/json-rpc-error';

@Component({
  selector: 'app-content-dialog-error',
  templateUrl: './content-dialog-error.component.html',
  styleUrls: ['./content-dialog-error.component.css']
})
export class ContentDialogErrorComponent implements OnInit {

  private errors: JsonRpcError[];
  constructor(public dialogRef: MatDialogRef<DataWindowError>,
              @Inject(MAT_DIALOG_DATA) public data: DataWindowError) {
                  this.errors = data.dataRow;
                  console.log(this.errors);
              }

  ngOnInit() {

  }

  onNoClick(): void {
    this.dialogRef.close();
  }
}
