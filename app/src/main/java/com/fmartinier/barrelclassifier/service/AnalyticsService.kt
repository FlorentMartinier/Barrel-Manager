package com.fmartinier.barrelclassifier.service

import android.os.Bundle
import com.google.firebase.Firebase
import com.google.firebase.analytics.analytics

class AnalyticsService {

    companion object {
        fun logBarrelAdded(woodType: String, volume: String) {
            val parameters = Bundle().apply {
                this.putString("wood_type", woodType)
                this.putString("volume", volume)
            }
            Firebase.analytics.logEvent("barrel_add_success",parameters)
        }

        fun logHistoryAdded() {
            Firebase.analytics.logEvent("history_add_success", Bundle())
        }

        fun logQrShared() {
            Firebase.analytics.logEvent("qr_cloud_shared", Bundle())
        }

        fun logImportQrAccountError() {
            Firebase.analytics.logEvent("import_qr_account_error", Bundle())
        }

        fun logImportQrError() {
            Firebase.analytics.logEvent("import_qr_error", Bundle())
        }

        fun logPdfExport() {
            Firebase.analytics.logEvent("pdf_export", Bundle())
        }

        fun logGeneralExport() {
            Firebase.analytics.logEvent("general_export", Bundle())
        }

        fun logImportSuccess() {
            Firebase.analytics.logEvent("data_import_success", Bundle())
        }

        fun logCameraLauncherUpdate() {
            Firebase.analytics.logEvent("camera_launcher_update", Bundle())
        }

        fun logHistoryCameraLaucherUpdate() {
            Firebase.analytics.logEvent("history_camera_launcher_update", Bundle())
        }

        fun logHistoryImageLauncherUpdate() {
            Firebase.analytics.logEvent("history_image_launcher_update", Bundle())
        }

        fun logPickHistoryImageLauncherUpdate() {
            Firebase.analytics.logEvent("pick_history_image_launcher_update", Bundle())
        }

        fun logPickBarrelImageLauncherUpdate() {
            Firebase.analytics.logEvent("pick_barrel_image_launcher_update", Bundle())
        }

        fun logToggleHistory() {
            Firebase.analytics.logEvent("toggle_history", Bundle())
        }

        fun logToggleStats() {
            Firebase.analytics.logEvent("toggle_stat", Bundle())
        }

        fun logDeleteBarrel() {
            Firebase.analytics.logEvent("delete_barrel", Bundle())
        }

        fun logOpenDialogAddBarrel() {
            Firebase.analytics.logEvent("open_dialog_add_barrel", Bundle())
        }

        fun logOpenDialogAddHystory() {
            Firebase.analytics.logEvent("open_dialog_add_hystory", Bundle())
        }

        fun logImportError(error: String) {
            val parameters = Bundle().apply {
                this.putString("error", error)
            }
            Firebase.analytics.logEvent("data_import_error", parameters)
        }
    }
}