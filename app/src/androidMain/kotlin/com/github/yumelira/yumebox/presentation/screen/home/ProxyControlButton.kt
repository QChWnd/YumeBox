<<<<<<< HEAD
/*
 * This file is part of YumeBox.
 *
 * YumeBox is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 *
 * Copyright (c)  YumeLira 2025.
 *
 */

package com.github.yumelira.yumebox.presentation.screen.home

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
=======
package com.github.yumelira.yumebox.presentation.screen.home

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
>>>>>>> upstream/Yume
import androidx.compose.ui.unit.dp
import com.github.yumelira.yumebox.common.AppConstants
import com.github.yumelira.yumebox.presentation.icon.Yume
import com.github.yumelira.yumebox.presentation.icon.yume.Play
import com.github.yumelira.yumebox.presentation.icon.yume.Square
import top.yukonga.miuix.kmp.basic.Button
import top.yukonga.miuix.kmp.basic.ButtonDefaults
import top.yukonga.miuix.kmp.basic.Icon
import top.yukonga.miuix.kmp.basic.Text
import top.yukonga.miuix.kmp.theme.MiuixTheme
<<<<<<< HEAD
import dev.oom_wg.purejoy.mlang.MLang
=======
>>>>>>> upstream/Yume

@Composable
fun ProxyControlButton(
    isRunning: Boolean,
    isEnabled: Boolean,
    hasEnabledProfile: Boolean,
    hasProfiles: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
<<<<<<< HEAD
=======
    val animatedWidthFraction by animateFloatAsState(
        targetValue = if (isRunning) 0.24f else 0.32f,
        animationSpec = tween(
            durationMillis = 280,
            easing = FastOutSlowInEasing
        ),
        label = "WidthFraction"
    )

    val animatedCornerRadius by animateDpAsState(
        targetValue = if (isRunning)
            AppConstants.UI.BUTTON_CORNER_RADIUS + 4.dp
        else
            AppConstants.UI.BUTTON_CORNER_RADIUS,
        animationSpec = tween(
            durationMillis = 280,
            easing = FastOutSlowInEasing
        ),
        label = "CornerRadius"
    )

    MiuixTheme.colorScheme.surface
    MiuixTheme.colorScheme.onSurface

>>>>>>> upstream/Yume
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        if (!hasProfiles) {
<<<<<<< HEAD
            Text(
                text = MLang.Home.Control.HintAddProfile,
                style = MiuixTheme.textStyles.body2,
                color = MiuixTheme.colorScheme.onSurfaceVariantSummary
            )
        } else if (!hasEnabledProfile) {
            Text(
                text = MLang.Home.Control.HintEnableProfile,
                style = MiuixTheme.textStyles.body2,
                color = MiuixTheme.colorScheme.onSurfaceVariantSummary
            )
=======
            HintText("请先添加配置文件")
        } else if (!hasEnabledProfile) {
            HintText("请先在「配置」页面启用一个配置")
>>>>>>> upstream/Yume
        }

        Button(
            onClick = onClick,
<<<<<<< HEAD
            modifier = Modifier.fillMaxWidth(0.32f),
            enabled = isEnabled,
            colors = ButtonDefaults.buttonColorsPrimary(),
            cornerRadius = AppConstants.UI.BUTTON_CORNER_RADIUS,
=======
            enabled = isEnabled,
            modifier = Modifier
                .fillMaxWidth(animatedWidthFraction)
                .shadow(
                    elevation = 1.dp,
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(animatedCornerRadius),
                    clip = false
                )
                .border(
                    width = 0.2.dp,
                    color = MiuixTheme.colorScheme.outline,
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(animatedCornerRadius)
                ),
            colors = ButtonDefaults.buttonColors(MiuixTheme.colorScheme.background),
            cornerRadius = animatedCornerRadius,
>>>>>>> upstream/Yume
            minHeight = 36.dp
        ) {
            Icon(
                imageVector = if (isRunning) Yume.Square else Yume.Play,
<<<<<<< HEAD
                contentDescription = if (isRunning) MLang.Home.Control.Stop else MLang.Home.Control.Start,
                tint = MiuixTheme.colorScheme.onPrimary
            )
        }
    }
}
=======
                contentDescription = null,
                tint = MiuixTheme.colorScheme.onSurface
            )
        }


    }
}


@Composable
private fun HintText(text: String) {
    Text(
        text = text,
        style = MiuixTheme.textStyles.body2,
        color = MiuixTheme.colorScheme.onSurfaceVariantSummary
    )
}
>>>>>>> upstream/Yume
