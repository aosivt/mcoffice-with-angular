package ru.mobilcard.mcoffice.database.config;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.table.TableField;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.tree.RootTreeWorkNode;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.tree.TreeWorkNode;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TreeWorkNodeResponse implements Serializable {

    private RootTreeWorkNode key;
    private String value;
    private boolean view;
    private String typeDB;
    private String defaultField;
    private String typeView;

    public TreeWorkNodeResponse(TreeWorkNode tf){
        key = tf.root();

    }
}
