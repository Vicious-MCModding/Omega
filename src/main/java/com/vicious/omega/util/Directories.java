package com.vicious.omega.util;

import com.vicious.omega.server.Server;
import com.vicious.viciouslib.util.FileUtil;

import java.nio.file.Path;

public class Directories {
    public static final Path pluginsDir = FileUtil.createDirectoryIfDNE(Server.getServer().getGameDir().toAbsolutePath() + "/plugins");
}
