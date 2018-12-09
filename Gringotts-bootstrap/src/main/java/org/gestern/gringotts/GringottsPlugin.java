package org.gestern.gringotts;

import au.com.grieve.multi_version_plugin.MultiVersionPlugin;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;

public class GringottsPlugin extends MultiVersionPlugin {

    static {
        List<String> versions = new ArrayList<>();

        // Add Server Versions
        String serverVersion = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3].substring(1).replace("_",".");
        switch(serverVersion.substring(0, StringUtils.ordinalIndexOf(serverVersion, ".", 2))) {
            case "1.8":
//                versions.add("1_8_R3");
            case "1.9":
//                versions.add("1_9_R2");
            case "1.10":
//                versions.add("1_10_R1");
            case "1.11":
//                versions.add("1_11_R1");
            case "1.12":
                versions.add("1_12_R1");
        }

//        // Add WorldGuard Versions  (Not needed since we don't use BlockVector3)
//        if (isClass("com.sk89q.worldedit.BlockVector")) {
//            versions.add("WG_7_0_0_S1");
//        }

        initPlugin("org.gestern.gringotts", "Gringotts", versions);
    }

}
