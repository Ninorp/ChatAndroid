package br.com.app.zoin.cp2tjk.chat_android;

/**
 * Created by Rodolfo on 02/05/2017.
 */

public interface IHTTPService<T> {

    void Send(T obj);

    T Get();
}
