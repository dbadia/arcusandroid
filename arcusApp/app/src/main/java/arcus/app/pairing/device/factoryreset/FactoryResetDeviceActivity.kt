/*
 *  Copyright 2019 Arcus Project.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package arcus.app.pairing.device.factoryreset

import android.os.Bundle
import arcus.app.R
import arcus.app.activities.ConnectedActivity

class FactoryResetDeviceActivity : ConnectedActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory_reset_device)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        this.supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(
                        R.id.container,
                        FactoryResetWarningFragment(),
                        "FACTORY_RESET_WARNING"
                )
                .commit()
    }

    override fun onBackPressed() {
        // Do nothing to prevent Back Press
    }

}
