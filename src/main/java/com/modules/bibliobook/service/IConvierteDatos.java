package com.modules.bibliobook.service;

public interface IConvierteDatos {
    <T> T obtenerDatos (String json, Class<T> clase);
}
