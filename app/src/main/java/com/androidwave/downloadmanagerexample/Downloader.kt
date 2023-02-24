package com.androidwave.downloadmanagerexample

interface Downloader {
    fun downloadFile(url: String): Long
}