package com.ms.module.supers.client;

public final class ModuleSuperFirmwareInformation {

    public static String name() {
        return Modules.getUtilsModule().getResUtils().getString(Modules.getUtilsModule().getResUtils().getId("com_ms_module_super_name"));
    }

    public static String version() {
        return Modules.getUtilsModule().getResUtils().getString(Modules.getUtilsModule().getResUtils().getId("com_ms_module_super_version"));
    }

    public static String releaseDate() {
        return Modules.getUtilsModule().getResUtils().getString(Modules.getUtilsModule().getResUtils().getId("com_ms_module_super_release_date"));
    }

    public static String dependencies() {
        return Modules.getUtilsModule().getResUtils().getString(Modules.getUtilsModule().getResUtils().getId("com_ms_module_super_dependencies"));
    }
}
