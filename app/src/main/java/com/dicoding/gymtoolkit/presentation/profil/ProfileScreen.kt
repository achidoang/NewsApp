package com.dicoding.gymtoolkit.presentation.profil

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.ui.theme.GymToolKitTheme

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    profileImageUrl: String = "https://dicoding-web-img.sgp1.cdn.digitaloceanspaces.com/small/avatar/dos:7ad02d1cf0a64096948fe9c559ea988520231012224836.png"
) {

    val urlImage by rememberSaveable { mutableStateOf(profileImageUrl) }

    Column(
        modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AsyncImage(
            model = urlImage,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(8.dp)
                .size(150.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(id = R.string.profile_name),
            modifier = modifier
                .fillMaxWidth()
                .padding(2.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.labelLarge
        )
        Text(
            text = stringResource(id = R.string.profile_email),
            modifier = modifier
                .fillMaxWidth()
                .padding(2.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.labelMedium
        )
        Text(
            text = stringResource(id = R.string.profile_role),
            modifier = modifier
                .fillMaxWidth()
                .padding(2.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.labelMedium
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun AboutPreview() {
    GymToolKitTheme {
        ProfileScreen()
    }
}