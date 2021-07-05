package com.anggi.datatemananggi

class data_teman {
    var nama: String? = null
    var alamat: String? = null
    var noHp: String? = null
    var key: String?= null
    var jkel: String? = null

    constructor()

    constructor(nama: String?, alamat: String?, noHp: String?, jkel:String?) {
        this.nama = nama
        this.alamat = alamat
        this.noHp = noHp
        this.jkel= jkel
    }
}