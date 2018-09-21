package org.amlabs.keystore

import java.io.InputStream
import java.security.KeyStore

object IntracKeyStore {
    var keyStore: KeyStore? = null
    init {
        keyStore = KeyStore.getInstance("JKS")
        val tempKeyStoreStream: InputStream = IntracKeyStore::class.java.classLoader.getResourceAsStream("intrac.jks")
        keyStore?.load(tempKeyStoreStream, "PASSWORD".toCharArray())
        tempKeyStoreStream.close()
    }
}