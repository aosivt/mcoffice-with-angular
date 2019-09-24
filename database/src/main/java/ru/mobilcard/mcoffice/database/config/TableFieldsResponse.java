package ru.mobilcard.mcoffice.database.config;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.TableFields;

import java.io.Serializable;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TableFieldsResponse implements Serializable {

    private String key;
    private String value;
    private boolean view;
    private String typeDB;
    private String defaultField;
    private String typeView;

    public TableFieldsResponse(TableFields tf){
        key = tf.key();
        value = tf.value();
        view = tf.view();
        typeDB = tf.typeDB();
        defaultField = tf.defaultField();
        typeView = tf.typeView();
    }
}
