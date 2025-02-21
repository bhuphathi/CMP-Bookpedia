import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.clear_search
import cmp_bookpedia.composeapp.generated.resources.search_hint
import com.plcoding.bookpedia.core.presentation.DarkBlue
import com.plcoding.bookpedia.core.presentation.DesertWhite
import com.plcoding.bookpedia.core.presentation.SandYellow
import org.jetbrains.compose.resources.stringResource

/**
 * [https://youtu.be/WT9-4DXUqsM?t=2440](https://youtu.be/WT9-4DXUqsM?t=2440)
 */
@Composable
fun BookSearchBar(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onImeSearch: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    CompositionLocalProvider(
        // 'provides' is an infix function can also be written like this ==> LocalTextSelectionColors provides TextSelectionColors
        LocalTextSelectionColors.provides(
            TextSelectionColors(
                handleColor = DarkBlue, backgroundColor = SandYellow
            )
        )
    ) {
        OutlinedTextField(
            value = searchQuery,
            onValueChange = onSearchQueryChange,
            shape = RoundedCornerShape(100),
            colors = OutlinedTextFieldDefaults.colors(
                cursorColor = DarkBlue, focusedBorderColor = SandYellow
            ),
            placeholder = {
                Text(text = stringResource(Res.string.search_hint))
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.66f)
                )
            },
            singleLine = true,
            keyboardActions = KeyboardActions(onSearch = {
                onImeSearch()
            }),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text, imeAction = ImeAction.Search
            ),
            trailingIcon = {
                AnimatedVisibility(
                    visible = searchQuery.isNotBlank()
                ) {
                    IconButton(
                        onClick = { onSearchQueryChange("") },
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = stringResource(Res.string.clear_search),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            },
            modifier = modifier.background(shape = RoundedCornerShape(100), color = DesertWhite)
                .minimumInteractiveComponentSize(),
        )

    }
}