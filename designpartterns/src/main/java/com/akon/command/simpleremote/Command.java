package com.akon.command.simpleremote;

/**
 * 命令行模式接口定义
 */
public interface Command {

    void execute();
    void undo();
}
